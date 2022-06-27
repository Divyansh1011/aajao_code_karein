public class count_number_of_ways_to_place_house 
{
    //# 
     
    public int countHousePlacements(int n) 
    {
        int a = 1, b = 1, c = 2, mod = (int)1e9 + 7;
        for (int i = 0; i < n; ++i) {
            c = (a + b) % mod;
            a = b;
            b = c;
        }
        return (int)(1L * b * b % mod);
        
    }
    public static void main(String[] args) {
        
    }
}
