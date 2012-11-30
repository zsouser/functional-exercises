import java.util.List;
import java.util.ArrayList;
/**
 * Exercises in functional programming. Using function application
 * and recursion only, these simple (and difficult) programs are
 * side-effect free
 * 
 * @author Zach Souser 
 * @version 1.0
 */
public class Exercises
{
    /** 
     * Functional sum function. Utilizes tail recursion on an
     * immutable list of values to calculate and return a sum
     * 
     * @param   values  the values to be summed
     * @return  the sum
     */
    
    public static Integer sum(final List<Integer> values) {
       if (values.size() == 0) return 0;
       if (values.size() == 1) return values.get(0);
       else return values.get(0) + sum(values.subList(1,values.size()));
    }
    
    /**
     * Functional product function. 
     * 
     * @param   values  the values to be multiplied
     * @return  the product
     */
    
    public static Integer product(final List<Integer> values) {
       if (values.size() == 0) return 0;
       if (values.size() == 1) return values.get(0);
       else return values.get(0) * product(values.subList(1,values.size()));
    }
    
    /**
     * Count the number of non-overlapping occurrences of a string using
     * tail recursion to parse an immutable string
     * 
     * @param   toExamine the string under examination
     * @param   sub the substring to be searched for
     * @return  the count of the occurrences of sub in toExamine
     */
    
    public static Integer strCount(final String toExamine, final String sub) {
        if (toExamine.length() < sub.length()) return 0;
        if (toExamine.substring(0,sub.length()).equals(sub))
            return 1 + strCount(toExamine.substring(sub.length()),sub);
        return strCount(toExamine.substring(1),sub);
    }
    
    /**
     * Determine using tail recursion whether a group of numbers forms
     * a target number when added. Zero always exists, and if there are no numbers,
     * no group exists. If there is only one number, the target must be the number
     * in the list. Otherwise, recursively determine whether the group exists in
     * all sublists, but also in all sublists forced to include the first value.
     * Otherwise, returns false.
     * 
     * @param   numbers the numbers to be grouped
     * @param   target  the target number
     * @return  the boolean answer to whether the group exists
     */
    
    public static boolean groupExists(final List<Integer> numbers, final int target) {
        if (target == 0) return true;
        if (numbers.size() == 0) return false;
        if (numbers.size() == 1) return numbers.get(0) == target;
        if (numbers.size() >= 2) return groupExists(numbers.subList(1,numbers.size()),target-numbers.get(0)) || groupExists(numbers.subList(1,numbers.size()),target);
        return false;
    }
}
