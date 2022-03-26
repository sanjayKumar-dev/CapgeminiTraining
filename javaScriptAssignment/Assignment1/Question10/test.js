function fibonacci(num)
{
    var num1=0;
    var num2=1;
    var sum;
    for (i = 0; i < num; i++) 
    {
        sum=num1+num2;
        num1=num2;
        num2=sum;
    }
    return num2;
}

document.write(fibonacci(100));