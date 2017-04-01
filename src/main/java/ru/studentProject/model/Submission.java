package ru.studentProject.model;


import javax.persistence.*;

@Entity
@Table(name = "submissionn", schema = "public", catalog = "nc_stud_proj")
public class Submission {

    private long id;
    private boolean result;
    private User mentor;
    private Step step;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "result")
    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_id")
    public User getMentor() {
        return mentor;
    }

    public void setMentor(User mentor) {
        this.mentor = mentor;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "step_id")
    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }
}
