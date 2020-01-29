package se.ecutb.model;

import java.util.Objects;


    public class AppUser {
        private static int counter;
        private int appUserId;
        private String firstName;
        private String lastName;
        private String email;

         AppUser(int appUserId, String firstName, String lastName, String email) {
            this.appUserId = appUserId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public AppUser(String firstName, String lastName, String email) {
            this(++counter, firstName, lastName, email);
        }

        public int getAppUserId() {
            return appUserId;
        }

        public void setAppUserId(int appUserId) {
            this.appUserId = appUserId;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof AppUser)) return false;
            AppUser appUser = (AppUser) o;
            return appUserId == appUser.appUserId &&
                    Objects.equals(firstName, appUser.firstName) &&
                    Objects.equals(lastName, appUser.lastName) &&
                    Objects.equals(email, appUser.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(appUserId, firstName, lastName, email);
        }

        @Override
        public String toString() {
            return "AppUser{" +
                    "appUserId=" + appUserId +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

