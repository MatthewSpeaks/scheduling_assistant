package ms.schedulingassistant.scheduling_assistant.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class HiringManager {

    @Size(min = 3, max = 30)
    @NotNull
    private String name;

    @Valid
    @NotNull
    private String email;

    @Size(min = 3, max = 30)
    @NotNull
    private String title;

    public HiringManager (String aName, String aEmail, String aTitle) {
        this.name = aName;
        this.email = aEmail;
        this.title = aTitle;
    }

    @Override
    public String toString() {
        return "HiringManager{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HiringManager that)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
