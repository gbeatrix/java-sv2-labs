package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {
    static PrimarySchoolChild of(int age) {
        int[] limits = {6, 11, 15};
        int i = 0;
        while (i < limits.length && age >= limits[i]) {
            i++;
        }
        switch (i) {
            case 1:
                return new LowerClassSchoolChild(age);
            case 2:
                return new UpperClassSchoolChild(age);
            case 0, 3:
            default:
                throw new IllegalArgumentException("It's not a schoolchild with this age!");
        }
    }
}
