//program for single dimention array;
import java.util.Arrays;
class ArrayDemo
{
int arr[];

ArrayDemo(int size)
{
arr= new int[size];

for(int i=0;i<size;i++)
{
arr[i]= Integer.MIN_VALUE;
}

}

public static void main(String []args)
{

ArrayDemo ad= new ArrayDemo(3);
System.out.println(Arrays.toString(ad.arr));
}
}