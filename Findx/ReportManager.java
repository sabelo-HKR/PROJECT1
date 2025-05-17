package reportitem;
import java.util.ArrayList;
import java.util.List;

public class ReportManager {
    private final List<Report> reports;
    private int nextId;

    public ReportManager() {
        this.reports = new ArrayList<>();
        this.nextId = 1;
    }

    public Report createReport(String description) {
        Report newReport = new Report(nextId++, description);
        reports.add(newReport);
        return newReport;
    }

    public List<Report> getAllReports() {
        return new ArrayList<>(reports); 
    }

    public Report getReportById(int id) {
        for (Report report : reports) {
            if (report.getId() == id) {
                return report;
            }
        }
        return null;
    }

    public boolean updateReportStatus(int id, String newStatus) {
        Report report = getReportById(id);
        if (report != null) {
            report.setStatus(newStatus);
            return true;
        }
        return false;
    }

    public static class Report {
        private final int id;
        private final String description;
        private String status;

        public Report(int id, String description) {
            this.id = id;
            this.description = description;
            this.status = "Pending"; 
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}