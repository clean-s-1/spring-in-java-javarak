package statisticker;
class StatsChecker {

    private Float maxThreshold;
    private IAlerter iAlerter[];

    public StatsChecker(Float maxThreshold, IAlerter[] iAlerter) {
        super();
        this.maxThreshold = maxThreshold;
        this.iAlerter = iAlerter;
    }

    public void checkAndAlert(Float[] numbers) {

    }

}
