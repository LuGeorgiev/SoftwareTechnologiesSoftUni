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
        $final =intval($_GET['num']);
        $first =1;
        echo $first." ";
        $second =1;
        echo $second." ";
        $third =$first+$second;
        echo $third." ";
        for ($i=3;$i<$final;$i++)
        {
            $result =$first+$second+$third;
            echo $result." ";

            $first=$second;
            $second=$third;
            $third=$result;
        }

    }
    ?>
</body>
</html>