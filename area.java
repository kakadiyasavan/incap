public class area {

    public static void main(String[] args) {
        marg r = new marg();
        r.Setlength(20);
        r.Setwidth(19);

        System.out.println("total Area of : " + r.getwidth() * +r.getlength());
    }
}

class marg {
    int length;
    int width;

    public void Setlength(int length) {
        this.length = length;
    }

    public int getlength() {
        return length;
    }

    public void Setwidth(int width) {
        this.width = width;
    }

    public int getwidth() {
        return width;
    }
}
