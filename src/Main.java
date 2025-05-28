import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resume resume = new Resume();

        System.out.println("Welcome to Resume Builder!");
        System.out.print("Enter your name: ");
        resume.name = sc.nextLine();

        System.out.print("Enter your email: ");
        resume.email = sc.nextLine();
        while (!InputValidator.isValidEmail(resume.email)) {
            System.out.print("Invalid email! Re-enter: ");
            resume.email = sc.nextLine();
        }

        System.out.print("Enter your phone number: ");
        resume.phone = sc.nextLine();
        while (!InputValidator.isValidPhone(resume.phone)) {
            System.out.print("Invalid phone! Re-enter: ");
            resume.phone = sc.nextLine();
        }

        System.out.print("Enter your education: ");
        resume.education = sc.nextLine();

        System.out.print("Enter your experience: ");
        resume.experience = sc.nextLine();

        System.out.print("Enter your skills (comma-separated): ");
        resume.skills = sc.nextLine();

        try {
            String template = Template.load("templates/basic_template.txt");
            String filledResume = ResumeBuilder.fillTemplate(template, resume);
            FileSaver.save(filledResume, "output/resume_output.txt");
            System.out.println("\n✅ Resume generated successfully! Check output/resume_output.txt");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
