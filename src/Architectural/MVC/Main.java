package Architectural.MVC;

import Architectural.MVC.controller.CourseController;
import Architectural.MVC.model.Course;
import Architectural.MVC.view.CourseView;

public class Main {
    public static void main(String[] args) {
        Course model  = retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        controller.setCourseName("Java");
        System.out.println("\nAfter updating, Course Details are as follows\n");
        controller.updateView();
    }
    private static Course retriveCourseFromDatabase(){
        Course course = new Course();
        course.setName("C++");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}
