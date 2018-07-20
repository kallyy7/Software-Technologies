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
    if (isset($_GET["num"])) {
        $number = intval($_GET["num"]);
        function prime($number)
        {
            for ($i = $number; $i >= 1; $i--) {
                $counter = 0;
                for ($j = $i; $j >= 1; $j--) {
                    if ($i % $j == 0) {
                        $counter++;
                    }
                }
                if ($counter == 2) {
                    print $i . " ";
                }
            }
        }
        prime($number);
    }
    ?>
</body>
</html>