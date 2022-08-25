package generalization;

public class BoundeWildcard {
    static void showXY(Coords<?> c) {
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
    }

    static void showAll(Coords<? extends FourD> c) {
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(),
                new TwoD()
        };
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        showXY(tdlocs);
//        showXYZ(tdlocs);
//        showAll(tdlocs);

        FourD fd[] = {
                new FourD(),
                new FourD()
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}
