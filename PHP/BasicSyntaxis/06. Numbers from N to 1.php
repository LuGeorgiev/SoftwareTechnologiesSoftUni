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
    $start =intval($_GET['num']);
    for ($i=$start;$i>=1;$i-=1)
    {
        if ($i%2==1)
        {
            echo $i ." ";
        }

    }
	?>
</body>
</html>