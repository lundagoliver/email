<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Sending Email with Freemarker HTML Template Example</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

    <!-- use the font -->
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">

    <table align="center" border="0" cellpadding="0" cellspacing="0" width="600" style="border-collapse: collapse;">
        <tr>
            <td align="center" bgcolor="#78ab46" style="padding: 40px 0 30px 0;">
                <img src="cid:maintenance-services.jpg" alt="http://aplus777.com" style="display: block;" />
            </td>
        </tr>
        <tr>
            <td bgcolor="#eaeaea" style="padding: 40px 30px 40px 30px;">
                <p>Hi,</p>
				<p>System check of <b>${GSP_NAME}</b> proceeds as follows.</p>
				<p>Game company: <b>${GSP_NAME}</b></p>
				<p>Game company: <b>${GSP_NAME}</b></p>
				<p>Miscellaneous: <b>This is a regular system check.</b></p>
                <p>In order to provide a more stable and smooth game environment, we will check regularly. We will inform you that we will restart the game after the check is completed. Should you have any queries, please contact us through our 24-hour Support for any assistance. Thank you for your attention and we apologize for any inconvenience that may cause.</p>
                <p>Thank you.</p>
            </td>
        </tr>
        <tr>
            <td bgcolor="#777777" style="padding: 30px 30px 30px 30px;">
                <p>${SIGNATURE}</p>
				<p>Don't like these emails? <a href="http://aplus777.com">Unsubscribe</p>
            </td>
        </tr>
    </table>

</body>
</html>