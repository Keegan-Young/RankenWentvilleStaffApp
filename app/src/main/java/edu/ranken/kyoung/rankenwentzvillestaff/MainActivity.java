package edu.ranken.kyoung.rankenwentzvillestaff;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button                     btnAddOrEditMember;
    RecyclerView               rvStaff;
    RecyclerView.Adapter       mAdapter;
    RecyclerView.LayoutManager layoutManager;
    Menu                       menu;

    List<Staff> staffList;
    MyApplication MyApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        staffList = MyApplication.getStaffList();

        // Widget References
        btnAddOrEditMember = findViewById(R.id.btnAddOrEditMember);
        rvStaff      = findViewById(R.id.rvStaff);

        rvStaff.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvStaff.setLayoutManager(layoutManager);

        mAdapter = new CustomAdapter(staffList, this);
        rvStaff.setAdapter(mAdapter);

        btnAddOrEditMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddOrEditStaffMember.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sort_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuSortLastNameAscending:
                Collections.sort(staffList, Staff.LastNameAscComparator);
                mAdapter.notifyDataSetChanged();
                return true;

            case R.id.menuSortLastNameDescending:
                Collections.sort(staffList, Staff.LastNameDescComparator);
                mAdapter.notifyDataSetChanged();
                return true;

            case R.id.menuDepartmentNameAscending:
                Collections.sort(staffList, Staff.DepartmentAscComparator);
                mAdapter.notifyDataSetChanged();
                return true;

            case R.id.menuDepartmentNameDescending:
                Collections.sort(staffList, Staff.DepartmentDescComparator);
                mAdapter.notifyDataSetChanged();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}