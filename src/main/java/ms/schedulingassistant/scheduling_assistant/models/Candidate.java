package ms.schedulingassistant.scheduling_assistant.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Candidate {

    @Size(min = 3, max = 30)
    @NotNull
    private String name;

    @NotNull
    @Valid
    private String email;

    @Size(min = 3, max = 30)
    @NotNull
    private String applyingFor;

    public Candidate(String name, String email, String applyingFor) {
        this.name = name;
        this.email = email;
        this.applyingFor = applyingFor;
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

    public String getApplyingFor() {
        return applyingFor;
    }

    public void setApplyingFor(String applyingFor) {
        this.applyingFor = applyingFor;
    }
}
