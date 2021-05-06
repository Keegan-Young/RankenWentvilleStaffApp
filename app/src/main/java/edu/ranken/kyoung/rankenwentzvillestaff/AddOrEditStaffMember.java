package edu.ranken.kyoung.rankenwentzvillestaff;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class AddOrEditStaffMember extends AppCompatActivity {
    Button btnSave;
    Button btnCancel;
    EditText etFirstName;
    EditText etLastName;
    EditText etDepartmentName;
    EditText etImageURL;
    TextView tvNoEditID;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_or_edit_staff_member);

        // References to Widgets
        btnSave             = findViewById(R.id.btnSave);
        btnCancel           = findViewById(R.id.btnCancel);
        etFirstName         = findViewById(R.id.etFirstName);
        etLastName          = findViewById(R.id.etLastName);
        etDepartmentName    = findViewById(R.id.etDepartmentName);
        etImageURL          = findViewById(R.id.etImageURL);
        tvNoEditID          = findViewById(R.id.tvNoEditID);

        Intent intent = getIntent();
        id = intent.getIntExtra("id", -1);
        Staff staff = null;

        List<Staff> staffList;
        MyApplication MyApplication = (MyApplication) this.getApplication();

        staffList = MyApplication.getStaffList();

        if (id >= 0)
        {
            for (Staff s: staffList)
            {
                if (s.getId() == id)
                {
                    staff = s;
                }
            }
            tvNoEditID.setText(String.valueOf(id));
            etFirstName.setText(staff.getFirstName());
            etLastName.setText(staff.getLastName());
            etDepartmentName.setText(staff.getDepartmentName());
            etImageURL.setText(staff.getDepartmentName());

            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (id >= 0)
                    {
                        // Update an existing staff member
                        Staff updatedStaffMember = new Staff(
                                id,
                                etFirstName.getText().toString(),
                                etLastName.getText().toString(),
                                etDepartmentName.getText().toString(),
                                etImageURL.getText().toString());

                        // Add the updated staff member to the list
                        staffList.set(id, updatedStaffMember);
                    }
                    else
                    {
                        // Put all below into a try/catch block
                        // Create a new Staff object
                        int nextId = MyApplication.getNextId();
                        Staff newStaff = new Staff(
                                nextId,
                                etFirstName.getText().toString(),
                                etLastName.getText().toString(),
                                etDepartmentName.getText().toString(),
                                etImageURL.getText().toString());
                        staffList.add(newStaff);
                        MyApplication.setNextId(++nextId);
                    }
                }
            });

        }

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddOrEditStaffMember.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
