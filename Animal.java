public class Animal {
    // Private attributes
    private String aniID;
    private String birthdate;    // ISO 8601 format: YYYY-MM-DD
    private String color;
    static int weight;
    private String origin;
    private String arrivalDate;  // ISO 8601 format: YYYY-MM-DD
    private String name;
    private String aniSound;
    private String sex;
    static int numOfAnimals;

    // Getters and Setters
    public String getAniID() {
        return aniID;
    }

    public void setAniID(String aniID) {
        this.aniID = aniID;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAniSound() {
        return aniSound;
    }

    public void setAniSound(String aniSound) {
        this.aniSound = aniSound;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void setNumOfAnimals(int numOfAnimals) {
        this.numOfAnimals = numOfAnimals;
    }
}
