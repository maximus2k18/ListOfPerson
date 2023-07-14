package org.example;

public class Person {
    private Long id;
    private String name;
    private String lastName;
    private String patronymicName;
    private String dateOfBirth;
    enum gender{woman,man};
    enum marriage{married, single};

    public Person(Long id, String name, String lastName, String patronymicName,String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String lastName;
        private String patronymicName;
        private String dateOfBirth;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPatronymicName(String patronymicName) {
            this.patronymicName = patronymicName;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Person build() {
            return new Person(id, name, lastName, patronymicName, dateOfBirth);
        }


        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", patronymicName='" + patronymicName + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    '}';
        }
    }
}
