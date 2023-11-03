class Teacher {
  String designation;

  static String collegeName = "IIT";

}

class MathTeacher extends Teacher {
  String designation = "MathTeacher";

}

class EnglishTeacher extends MathTeacher {
  String designation = "English teacher";

}

class MusicTeacher extends EnglishTeacher {
  String designation = "MusicTeacher";
}

class CollegePrincipal {
  public static void main(String args[]) {

    MathTeacher obj1 = new MathTeacher();
    EnglishTeacher obj2 = new EnglishTeacher();
    MusicTeacher obj3 = new MusicTeacher();
    System.out.println(obj1.designation + " " + obj1.collegeName);
    System.out.println(obj2.designation + " " + obj2.collegeName);
    System.out.println(obj3.designation + " " + obj3.collegeName);

  }
}
