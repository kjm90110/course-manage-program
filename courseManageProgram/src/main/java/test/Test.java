package test;

import courseManageProgram.model.Course;
import courseManageProgram.service.CourseService;
import courseManageProgram.service.ProfessorService;
import courseManageProgram.service.impl.CourseServiceImpl;
import courseManageProgram.service.impl.ProfessorServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		ProfessorService service1 = new ProfessorServiceImpl();
		CourseService service = new CourseServiceImpl();
		
		try {
//			int result = service1.addProfessor(new Professor("kjm", "fji2", "침착맨", "fjwoi@49830jfdk"));
//			System.out.println(result>0 ? "등록 성공!" : "등록 실패ㅠ");
			
			
//			int result = service.removeCourse(2);
//			int result = service.modifyCourseName(new Course(3, "music", "djfowijf"));
			
			int result = service.modifyProfessorId(new Course(3, "서양화", 44, 0, "강의실4", "전공필수", "test", "fefe", "서양화과"));
			System.out.println(result>0 ? "등록 성공!" : "등록 실패ㅠ");


			//			List<Course>cList = service.getAllCourse();
//			System.out.println(cList);
			//			System.out.println(result>0 ? "등록 성공!" : "등록 실패ㅠ");
			
//			List<Course> profList = service.getAllCourse();
//			System.out.println(profList);
			
//			int result = service.modifyProfessorEmail(new Professor("djfiw", "fefiw", "현우진", "kjm90110@naver.com"));
//			System.out.println(result>0 ? "등록 성공!" : "등록 실패ㅠ");
			
//			int rs = service.modifyProfessorPassword(new Professor("djfiw", "password", "하이", "dkfjiewj3"));
//			System.out.println(rs>0 ? "등록 성공!" : "등록 실패ㅠ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
