package courseManageProgram.command;

import courseManageProgram.service.CourseService;
import courseManageProgram.service.ProfessorService;
import courseManageProgram.service.StudentService;
import courseManageProgram.service.impl.CourseServiceImpl;
import courseManageProgram.service.impl.ProfessorServiceImpl;
import courseManageProgram.service.impl.StudentServiceImpl;

public abstract class AbstractService implements RequestCommand {

	public CourseService courseService;
	public ProfessorService professorService;
	public StudentService studentService;
	
	public AbstractService() {
		courseService = new CourseServiceImpl();
		professorService = new ProfessorServiceImpl();
		studentService = new StudentServiceImpl();
	}
	
}
