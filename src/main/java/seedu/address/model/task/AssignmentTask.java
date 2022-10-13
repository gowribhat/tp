package seedu.address.model.task;

import javafx.collections.ObservableList;
import seedu.address.model.Model;
import seedu.address.model.student.Student;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

public class AssignmentTask extends Task {
    private ObservableList<Student> students;

    /**
     * Every field must be present and not null.
     *
     * @param title
     * @param description
     */
    public AssignmentTask(TaskTitle title, TaskDescription description, ObservableList<Student> students) {
        super(title, description);
        requireAllNonNull(students);
        this.students = students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

}
