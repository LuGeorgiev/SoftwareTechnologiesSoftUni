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
    for ($i=1;$i<=intval($_GET['num']);$i++)
    {
        if ($i % 2==0)
        {
            echo $i." ";
        }
    }
    ?>
</body>
</html>