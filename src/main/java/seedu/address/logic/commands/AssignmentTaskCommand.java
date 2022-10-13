package seedu.address.logic.commands;

import static seedu.address.logic.parser.CliSyntax.*;

public class AssignmentTaskCommand extends Command {
    public static final String COMMAND_WORD = "assignment";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a assignment task. "
            + "Parameters: "
            + PREFIX_TASK_TITLE + "TITLE "
            + PREFIX_TASK_DESCRIPTION + "DESCRIPTION... "
            + PREFIX_TASK_STUDENT + "STUDENT INDICES\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_TASK_TITLE + "CS2100 Assignment 1 "
            + PREFIX_TASK_DESCRIPTION + "Topics Tested: Chapters 1 - 5 "
            +PREFIX_TASK_STUDENT + "1, 3, 5";
}
