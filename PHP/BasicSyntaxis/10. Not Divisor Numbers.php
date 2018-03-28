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
        $start =intval($_GET['num']);
        for ($i=$start-1;$i>=1;$i-=1)
        {
            if ($start%$i!=0)
            {
                echo $i ." ";
            }

        }
    }
    ?>
</body>
</html>