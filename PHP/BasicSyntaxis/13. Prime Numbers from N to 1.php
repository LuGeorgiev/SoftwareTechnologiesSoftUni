<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if (isset($_GET['num']))
    {
        for ($i=intval($_GET['num']);$i>=2;$i--)
        {
            $isPrime =false;
            for ($k=2;$k*$k<=$i;$k++)
            {
                if($i%$k==0)
                {
                    $isPrime=true;
                    break;
                }
            }
            if ($isPrime==false)
            {
                echo $i." ";
            }
        }
    }
    ?>
</body>
</html>