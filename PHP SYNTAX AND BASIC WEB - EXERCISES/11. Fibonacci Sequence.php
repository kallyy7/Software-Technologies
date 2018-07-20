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
    if (isset($_GET['num'])) {
        $n = intval($_GET['num']);
        $fibSequence = array("1", "1");
        $tempFibNumber = 1;
        $fibMinusOne = 1;
        $fibMinusTwo = 1;
        for ($i = 2; $i < $n; $i++) {
            $tempFibNumber = $fibMinusOne + $fibMinusTwo;
            $fibMinusOne = $fibMinusTwo;
            $fibMinusTwo = $tempFibNumber;
            $fibSequence[$i] = $tempFibNumber;
        }
        echo implode(" ", $fibSequence);
    }
    ?>
</body>
</html>