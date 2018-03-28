<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
<?php
    for ($i=0;$i<5;$i++ )
    {
        for ( $j=0;$j<10;$j++  )
        {
            $rgbColor = $i*51+$j*5;
            echo"<div style=\"background-color: rgb($rgbColor, $rgbColor, $rgbColor);\"></div>";
        }
        echo "<br>";
    }
?>
</body>
</html>