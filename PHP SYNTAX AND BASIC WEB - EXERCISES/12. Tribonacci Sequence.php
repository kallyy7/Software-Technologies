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
        $fibSequence = array(intval("1"), intval("1"), intval("2"));
        for ($i = 3; $i < $n; $i++) {
            $tempFibNumber = $fibSequence[$i - 3] + $fibSequence[$i - 2] + $fibSequence[$i - 1];
            $fibSequence[$i] = $tempFibNumber;
        }
        echo implode(" ", $fibSequence);
    }
    ?>
</body>
</html>