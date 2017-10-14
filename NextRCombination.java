/*
按字典序生成下一个r组合

伪码描述
算法1: 按字典序生成下一个r组合
procedure next-combination({a1,...,ar}:{a1,...,ar}是{1,2,3,...,n}的一个r组合,且a1,..,ar是升序排列的)
    k:=r
    while ak=n-r+1 + k
        k:=k-1
    ak:=ak+1
    for j:= k+1 to r
        aj:=ak+j-k
    现在,a1,...,ar是字典序下的下一个r组合
*/

public class NextRCombination{
    /*
    a1,...,ar 是当前的r组合,且a1,...,ar是升序排序的
    n是集合中元素的总数
    方法将生成下一个r组合
    */
    public static void nextCombination(int a[],int n){
        int r = a.length;
        int k = r;
        while(a[k-1]==n-r+k) k--;

        a[k-1] = a[k-1]+1;
        for (int j = k+1;j<=r;j++){
            a[j-1]=a[k-1]+j-k;
        }

    }

    // testing
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int n = 5;
        // 以5元素的3组合为测试用例
        int c = 0;
        do{
            System.out.print(++c + "\t:");
            for(int x: a) {System.out.print(x+",");}
            System.out.println();
            nextCombination(a,n);
        }while(!isLastCom(a,n));
        System.out.print(++c + "\t:");
        for(int x: a) {System.out.print(x+",");}
        System.out.println();
    }
    /*
    判断所给的r组合是否是n元素集的最后一个r组合
    最后一个r组合是: {n-r+1,...,n}
    */
    private static boolean isLastCom(int a[], int n){
        boolean flag = true;
        for (int i = 1;i<=a.length;i++){
            if(a[i-1] != n - a.length + i){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
