public class Employee {

    private int empId;
    private String f_name;
    private String l_name;
    private String email;

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return empId == employee.empId && java.util.Objects.equals(f_name, employee.f_name) && java.util.Objects.equals(l_name, employee.l_name) && java.util.Objects.equals(email, employee.email);
    }

    public int getEmpId() {
        return empId;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getEmail() {
        return email;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), empId, f_name, l_name, email);
    }

    public static class EmployeeBuilder {

        private int empId;
        private String f_name;
        private String l_name;
        private String email;

        public Employee employee(EmployeeBuilder builder) {
            this.empId = builder.empId;
            this.f_name = nuilder.f_name;
            this.l_name = builder.l_name;
            this.email = builder.email;
        }

        public EmployeeBuilder builder() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder empId(int empId) {
            this.empId = empid;
            return this;
        }

        public EmployeeBuilder f_name(String f_name) {
            this.f_name = f_name;
            return this;

        }

        public EmployeeBuilder l_name(String l_name) {
            this.l_name = l_name;
            return this;

        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;

        }

        public Employee build() {

            return new Employee(this);

        }
    }
}