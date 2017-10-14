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
