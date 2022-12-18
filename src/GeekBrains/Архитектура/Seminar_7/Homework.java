package GeekBrains.Архитектура.Seminar_7;

import java.util.Date;

public class Homework {
    /**
     *     ДОМАШНЯЯ РАБОТА
     *
     *     Необходимо спроектировать сервис отчётов для компании оптовой торговли.
     *
     *     а. Доменная модель (компания, товарные категории, табличный отчёт,
     *         графики и диаграммы, финансовые показатели, ..), в виде текста Домен – атрибуты.
     *     b. Сформировать компоненты бизнес-логики (функциональные) необходимые для построения этих отчётов.
     */
    public static void main(String[] args) {

        SummaryReport summaryReport = new SummaryReport();
        summaryReport.generateReport();
        DetailedReport detailedReport = new DetailedReport();
        detailedReport.generateReport();

    }
}

class Report {
    protected TypeReport typeReport;
    protected FormatReport formatReport;
    protected Date reportDate;


    public TypeReport getTypeReport() {
        return typeReport;
    }

    public void setTypeReport(TypeReport typeReport) {
        this.typeReport = typeReport;
    }

    public FormatReport getFormatReport() {
        return formatReport;
    }

    public void setFormatReport(FormatReport formatReport) {
        this.formatReport = formatReport;
    }

    public Date getReportDate() {
        return new Date();
    }

}

interface reportGenerator {
    void generateReport();
}

class SummaryReport extends Report implements reportGenerator{
    private DataForTheSummaryReport dataForTheSummaryReport;

    @Override
    public void generateReport() {
        typeReport = new TypeReport(typeReport);
        formatReport = new FormatReport(formatReport);
        reportDate = getReportDate();
        dataForTheSummaryReport = new DataForTheSummaryReport();
        System.out.printf("Summary report is generated %s.\n", reportDate);
    }
}

class DetailedReport extends Report implements reportGenerator{
    private DataForTheDetailedReport dataForTheDetailedReport;


    @Override
    public void generateReport() {
        typeReport = new TypeReport(typeReport);
        formatReport = new FormatReport(formatReport);
        dataForTheDetailedReport = new DataForTheDetailedReport();
        reportDate = getReportDate();
        System.out.printf("Detailed report is generated %s.\n", reportDate);
    }
}



class TypeReport {
    private String typeReport;

    public TypeReport(TypeReport typeReport) {
    }

    public String getType() {
        return typeReport;
    }

    public void setType(String type) {
        this.typeReport = type;
    }

}

class FormatReport {
    private String formatType;

    public FormatReport(FormatReport formatType){
        this.formatType = String.valueOf(formatType);
    }

}

class DataForTheSummaryReport {
    private double income;
    private double expenses;
    private double profit;

    public DataForTheSummaryReport(){
        profit = income - expenses;
    }

}

class DataForTheDetailedReport {
    private double income;
    private double expenses;
    private double profit;

    public DataForTheDetailedReport(){
        profit = income - expenses;
    }
}