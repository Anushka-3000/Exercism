import java.util.*;

public class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PythagoreanTriplet) {
            PythagoreanTriplet p = (PythagoreanTriplet) obj;
            return a == p.a && b == p.b && c == p.c;
        }
        return false;
    }
    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    public static class PythagoreanTripletBuilder {
        private int sum;
        private Integer limit;
        public PythagoreanTripletBuilder thatSumTo(int s) {
            sum = s;
            return this;
        }
        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit) {
            this.limit = limit;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            int a = 1;
            int b = 0;
            boolean nextTriplet = true;
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            while(nextTriplet && a < sum) {
                int result1 = sum * sum - 2 * sum * a;
                int result2 = 2 * sum - 2 * a;
                if(result1 % result2 == 0) {
                    b = result1 / result2;
                    int c = sum - a - b;
                    if((a < b && b < c)) {
                        if(Objects.isNull(limit) || (a <= limit && b <= limit && c <= limit)) {
                            triplets.add(new PythagoreanTriplet(a, b, c));
                        }
                    }else {
                        nextTriplet = false;
                    }
                }
                a++;
            }
            return triplets.size() == 1 ? Collections.singletonList(triplets.get(0)) : triplets;
        }
    }
}