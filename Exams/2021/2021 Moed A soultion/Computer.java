import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Computer {
    
    public Computable minB(List<Computable> computables){
        class ComputableWrapper implements Computable {

            boolean calculated;
            double result;
            Computable computable;
            public ComputableWrapper(Computable c){
                computable = c;
            }

            @Override
            public double compute(){
                if(this.calculated){
                    return result;
                }
                result = computable.compute();
                calculated = true;
                return result;
                }
            };
        List<ComputableWrapper> memoised = new LinkedList<>();
        for(Computable c: computables){
            memoised.add(new ComputableWrapper(c));
        }
        ComputableWrapper c = Collections.min(memoised, (c1, c2) -> Double.compare(c1.compute(), c2.compute()));
        return c.computable;
    }

    public Computable minC(List<Computable> computables){
        class ComputableWrapper implements Computable, Comparable<ComputableWrapper>{
            Computable computable;
            public ComputableWrapper(Computable c){
                computable = c;
            }

            @Override
            public int compareTo(ComputableWrapper o) {
                return Double.compare(this.compute(), o.compute());
            }

            @Override
            public double compute() {
                return computable.compute();
            }
            
        }
        List<ComputableWrapper> comparables = new LinkedList<>();
        for(Computable c: computables){
            comparables.add(new ComputableWrapper(c));
        }

        ComputableWrapper c = Collections.min(comparables);
        return c.computable;
    }
}
