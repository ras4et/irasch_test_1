public class irasch_test_1 {
    public static void main(String[] args) {
        User tester = new User(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }

    static class User {
        private long id;
        private String vacancy;

        public void setId(long id) {
            this.id = id;
        }

        public void setVacancy(String vacancy) {
            this.vacancy = vacancy;
        }

        String getVacancy() {
            return Vacancy.getVacancy(vacancy);
        }

        long getId() {
            return id;
        }

        User (long id, String vacancy){
            setId(id);
            setVacancy(vacancy);
        }

    }
    static class Vacancy {
        static String getVacancy(String name_vacancy) {
            return name_vacancy;
        }
    }
}
