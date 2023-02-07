package models;

public class Opportunities {

    private final String opportunityName;
    private final String accountName;
    private final String type;
    private final int closeDate;
    private final String stage;
    private final String probability;
    private final String amount;
    private final String leadSource;
    private final String nextStep;
    private final String description;

    public void Opportunities(String opportunityName, String accountName, String type, int closeDate, String stage, String probability,
                         String amount, String leadSource, String nextStep, String description) {
    }
        public Opportunities(Opportunities leadBuilder) {


        this.opportunityName =leadBuilder.opportunityName;
        this.accountName = leadBuilder.accountName;
        this.type = leadBuilder.type;
        this.closeDate = leadBuilder.closeDate;
        this.stage = leadBuilder.stage;
        this.probability = leadBuilder.probability;
        this.amount = leadBuilder.amount;
        this.leadSource = leadBuilder.leadSource;
        this.nextStep = leadBuilder.nextStep;
        this.description = leadBuilder.description;
    }

    public String getOpportunityName() {
        return opportunityName;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getType() {
        return type;
    }

    public int getCloseDate() {
        return closeDate;
    }

    public String getStage() {
        return stage;
    }

    public String getProbability() {
        return probability;
    }

    public String getAmount() {
        return amount;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getNextStep() {
        return nextStep;
    }

    public String getDescription() {
        return description;
    }
}


