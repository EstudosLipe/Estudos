<?php
require __DIR__."/vendor/autoload.php";

use Microsoft\Graph\GraphServiceClient;

$graphServiceClient = new GraphServiceClient($tokenRequestContext, $scopes);

$result = $graphServiceClient->users()->get()->wait();