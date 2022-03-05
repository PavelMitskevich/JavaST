package com.mitskevich.task1.entity;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayParameter {
    private OptionalInt max;
    private OptionalInt min;
    private OptionalInt sum;
    private OptionalDouble average;

    public CustomArrayParameter() {
    }

    public CustomArrayParameter(OptionalInt max, OptionalInt min, OptionalInt sum, OptionalDouble average) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.average = average;
    }

    public OptionalInt getMax() {
        return max;
    }

    public void setMax(OptionalInt max) {
        this.max = max;
    }

    public OptionalInt getMin() {
        return min;
    }

    public void setMin(OptionalInt min) {
        this.min = min;
    }

    public OptionalInt getSum() {
        return sum;
    }

    public void setSum(OptionalInt sum) {
        this.sum = sum;
    }

    public OptionalDouble getAverage() {
        return average;
    }

    public void setAverage(OptionalDouble average) {
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArrayParameter that = (CustomArrayParameter) o;
        return max == that.max &&
                min == that.min &&
                sum == that.sum &&
                average == that.average;
    }

    @Override
    public int hashCode() {
        int result = max.hashCode();
        result = result * 31 + min.hashCode();
        result = result * 31 + sum.hashCode();
        result = result * 31 + average.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArrayParameter{");
        sb.append("max=").append(max);
        sb.append(", min=").append(min);
        sb.append(", sum=").append(sum);
        sb.append(", average=").append(average);
        sb.append('}');
        return sb.toString();
    }
}
