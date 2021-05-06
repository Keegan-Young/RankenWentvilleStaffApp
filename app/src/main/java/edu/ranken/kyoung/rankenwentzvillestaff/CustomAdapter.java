package edu.ranken.kyoung.rankenwentzvillestaff;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Staff> staffList;
    Context context;

    public CustomAdapter(List<Staff> presidentList, Context context) {
        this.staffList = presidentList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlestaffmember, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvStaffFirstName.setText(staffList.get(position).getFirstName());
        holder.tvStaffLastName.setText(staffList.get(position).getLastName());
        holder.tvStaffDepartmentName.setText(staffList.get(position).getDepartmentName());
        Glide.with(this.context).load(staffList.get(position).getImageURL()).into(holder.ivDepartmentImage);
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddOrEditStaffMember.class);
                intent.putExtra("id", staffList.get(position).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return staffList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView        ivDepartmentImage;
        TextView         tvStaffFirstName;
        TextView         tvStaffLastName;
        TextView         tvStaffDepartmentName;
        ConstraintLayout parentLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivDepartmentImage        = itemView.findViewById(R.id.ivDepartmentImage);
            tvStaffFirstName         = itemView.findViewById(R.id.tvStaffFirstName);
            tvStaffLastName          = itemView.findViewById(R.id.tvStaffLastName);
            tvStaffDepartmentName    = itemView.findViewById(R.id.tvStaffDepartmentName);
            parentLayout             = itemView.findViewById(R.id.singlestaffmemberline);
        }
    }
}
