public class ResumeBuilder {
    public static String fillTemplate(String template, Resume resume) {
        return template
            .replace("${name}", resume.name)
            .replace("${email}", resume.email)
            .replace("${phone}", resume.phone)
            .replace("${education}", resume.education)
            .replace("${experience}", resume.experience)
            .replace("${skills}", resume.skills);
    }
}
