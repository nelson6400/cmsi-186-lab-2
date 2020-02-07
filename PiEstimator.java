public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            } 
            var darts = Integer.parseInt(args[0]);
            if (darts < 1) {
              System.err.println("At least one dart required");
            } else {
              System.out.println(estimate(darts));
            }
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");
        } catch (IllegalArgumentException e) {
            System.err.println("Exactly one argument required");
        }
    }

    public static double estimate(int darts) {
        var inside = 0;
        if (darts < 1) {
            throw new IllegalArgumentException("At least one dart required");
        }
        for (var i = 0; i < darts; i++) {
            if (Math.hypot(Math.random(), Math.random()) <= 1) {
                inside += 1;
            }
        }
        return 4 * (double)inside/darts;
    }

    //
    // Don't be afraid to put in some private "helper" methods. You don't have to, of
    // course, but they could be useful and keep your code modular.
    //
}
