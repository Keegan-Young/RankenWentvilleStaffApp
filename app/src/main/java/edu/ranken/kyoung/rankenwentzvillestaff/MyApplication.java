package edu.ranken.kyoung.rankenwentzvillestaff;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {
    private static List<Staff> staffList = new ArrayList<Staff>();
    private static int nextId = 27;

    public MyApplication() {
        createStaffList();
    }

    public static List<Staff> getStaffList() {
        return staffList;
    }

    public static void setStaffList(List<Staff> staffList) {
        MyApplication.staffList = staffList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }

    private void createStaffList() {
        Staff s0 = new Staff(0, "John", "Baldwin", "Construction", "https://image.shutterstock.com/z/stock-vector-construction-worker-vector-icon-1245909412.jpg");
        Staff s1 = new Staff(1, "Justin", "Barnes", "Public Safety", "https://image.shutterstock.com/z/stock-vector-shield-with-check-mark-icon-on-white-background-vector-illustration-1040020312.jpg");
        Staff s2 = new Staff(2, "Shannon", "Brueggemann", "Education Office", "https://image.shutterstock.com/z/stock-vector-vector-education-icon-380065321.jpg");
        Staff s3 = new Staff(3, "Timothy", "Chandler", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s4 = new Staff(4, "Taylor", "Clark", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s5 = new Staff(5, "Charles", "Corrigan", "Information Technology", "https://image.shutterstock.com/z/stock-vector-laptop-chip-icon-on-white-background-737960002.jpg");
        Staff s6 = new Staff(6, "Eric", "DeSplinter", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s7 = new Staff(7, "Brad", "Elbert", "Manufacturing", "https://image.shutterstock.com/z/stock-vector-industrial-icon-171795467.jpg");
        Staff s8 = new Staff(8, "Brandon", "Fann", "Admissions", "https://image.shutterstock.com/z/stock-vector-admission-icon-on-white-background-simple-element-illustration-from-party-concept-admission-sign-1322827154.jpg");
        Staff s9 = new Staff(9, "Patrick", "Glynn", "Admissions", "https://image.shutterstock.com/z/stock-vector-admission-icon-on-white-background-simple-element-illustration-from-party-concept-admission-sign-1322827154.jpg");
        Staff s10 = new Staff(10, "James", "Gober", "Electrical", "https://image.shutterstock.com/z/stock-vector-lightning-electric-power-vector-logo-design-element-energy-and-thunder-electricity-symbol-concept-1173125734.jpg");
        Staff s11 = new Staff(11, "Chad", "Groharing", "Information Technology", "https://image.shutterstock.com/z/stock-vector-laptop-chip-icon-on-white-background-737960002.jpg");
        Staff s12 = new Staff(12, "Cory", "Hargett", "Electrical", "https://image.shutterstock.com/z/stock-vector-lightning-electric-power-vector-logo-design-element-energy-and-thunder-electricity-symbol-concept-1173125734.jpg");
        Staff s13 = new Staff(13, "Paul", "Knott", "Information Technology", "https://image.shutterstock.com/z/stock-vector-laptop-chip-icon-on-white-background-737960002.jpg");
        Staff s14 = new Staff(14, "Matthew", "Leigh", "Electrical", "https://image.shutterstock.com/z/stock-vector-lightning-electric-power-vector-logo-design-element-energy-and-thunder-electricity-symbol-concept-1173125734.jpg");
        Staff s15 = new Staff(15, "Tim", "Michel", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s16 = new Staff(16, "Lloyd", "Miller", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s17 = new Staff(17, "Dennis", "Pierce", "Electrical", "https://image.shutterstock.com/z/stock-vector-lightning-electric-power-vector-logo-design-element-energy-and-thunder-electricity-symbol-concept-1173125734.jpg");
        Staff s18 = new Staff(18, "Joseph", "Puglisi", "Manufacturing", "https://image.shutterstock.com/z/stock-vector-industrial-icon-171795467.jpg");
        Staff s19 = new Staff(19, "Shawn", "Ray", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s20 = new Staff(20, "Jeffery", "Scott", "Information Technology", "https://image.shutterstock.com/z/stock-vector-laptop-chip-icon-on-white-background-737960002.jpg");
        Staff s21 = new Staff(21, "Daniel", "Stevens", "Construction", "https://image.shutterstock.com/z/stock-vector-construction-worker-vector-icon-1245909412.jpg");
        Staff s22 = new Staff(22, "Alan", "Townsend", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s23 = new Staff(23, "Robert", "Vilmure", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s24 = new Staff(24, "Louie", "Waite", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s25 = new Staff(25, "Douglas", "Walden", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");
        Staff s26 = new Staff(26, "James", "Woods", "Automotive", "https://image.shutterstock.com/z/stock-vector-car-front-view-icon-on-transparent-background-1037068495.jpg");

        staffList.addAll(Arrays.asList(
                s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,
                s11,s12,s13,s14,s15,s16,s17,s18,s19,
                s20,s21,s22,s23,s24,s25,s26
        ));
    }
}

