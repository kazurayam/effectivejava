package effectivejava.chapter2.item2.builder;

public class NutritionFacts {

    private final int servingSize;  // ml
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // required parameters
        private final int servingSize;
        private final int servings;

        // optional parameters
        private int calories     = 0;
        private int fat          = 0;
        private int carbohydrate = 0;
        private int sodium       = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize  = builder.servingSize;
        this.serving      = builder.servings;
        this.calories     = builder.calories;
        this.fat          = builder.fat;
        this.sodium       = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

}
