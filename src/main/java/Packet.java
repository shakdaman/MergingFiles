public class Packet {
    private String claimNbr;
    private String fileOne;
    private String fileTwo;
    private String fileThree;
    private String fileFour;

    public Packet(String claimNbr, String fileOne, String fileTwo, String fileThree, String fileFour) {
        this.claimNbr = claimNbr;
        this.fileOne = fileOne;
        this.fileTwo = fileTwo;
        this.fileThree = fileThree;
        this.fileFour = fileFour;
    }

    public Packet(String claimNbr) {
        this.claimNbr = claimNbr;
    }

    public String getClaimNbr() {
        return claimNbr;
    }

    public String getFileOne() {
        return fileOne;
    }

    public String getFileTwo() {
        return fileTwo;
    }

    public String getFileThree() {
        return fileThree;
    }

    public String getFileFour() {
        return fileFour;
    }

    public void setClaimNbr(String claimNbr) {
        this.claimNbr = claimNbr;
    }

    public void setFileOne(String fileOne) {
        this.fileOne = fileOne;
    }

    public void setFileTwo(String fileTwo) {
        this.fileTwo = fileTwo;
    }

    public void setFileThree(String fileThree) {
        this.fileThree = fileThree;
    }

    public void setFileFour(String fileFour) {
        this.fileFour = fileFour;
    }
}
