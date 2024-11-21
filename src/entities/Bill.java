package entities;

public class Bill {
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill() {
    }

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover() {
        if (feeding() > 30.00) {
            return 0.00;
        } else {
            return 4.00;
        }
    }

    public double feeding() {
        double beerPrice = 5.00;
        double softDrinkPrice = 3.00;
        double barbecuePrice = 7.00;

        return (beerPrice * beer) + (softDrinkPrice * softDrink) + (barbecuePrice * barbecue);
    }

    public double ticket() {
        if (gender == 'M') {
            return 10.00;
        } else {
            return 8.00;
        }
    }

    public double total() {
        return cover() + feeding() + ticket();
    }

}
