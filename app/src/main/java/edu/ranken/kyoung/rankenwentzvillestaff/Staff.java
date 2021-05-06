package edu.ranken.kyoung.rankenwentzvillestaff;

import java.util.Comparator;

public class Staff {
    // Instance Variables
    private int id;
    private String firstName;
    private String lastName;
    private String departmentName;
    private String imageURL;

    // Constructor
    public Staff(int id, String firstName, String lastName, String departmentName, String imageURL) {
        this.id             = id;
        this.firstName      = firstName;
        this.lastName       = lastName;
        this.departmentName = departmentName;
        this.imageURL       = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public static Comparator<Staff> LastNameAscComparator = new Comparator<Staff>()
    {
        @Override
        public int compare(Staff s1, Staff s2) {
            return s1.getLastName().compareTo(s2.getLastName());
        }
    };

    public static Comparator<Staff> LastNameDescComparator = new Comparator<Staff>()
    {
        @Override
        public int compare(Staff s1, Staff s2) {
            return s2.getLastName().compareTo(s1.getLastName());
        }
    };

    public static Comparator<Staff> DepartmentAscComparator = new Comparator<Staff>()
    {
        @Override
        public int compare(Staff s1, Staff s2) {
            return s1.getDepartmentName().compareTo(s2.getDepartmentName());
        }
    };

    public static Comparator<Staff> DepartmentDescComparator = new Comparator<Staff>()
    {
        @Override
        public int compare(Staff s1, Staff s2) {
            return s2.getDepartmentName().compareTo(s1.getDepartmentName());
        }
    };
}

