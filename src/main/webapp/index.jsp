<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Acme Bank - Secure Login</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/style.css">
</head>
<body>

<div class="page-wrap">
	<header class="site-header">
		<div class="brand">
			<div class="logo">ACME<span>Bank</span></div>
			<div class="tag">Secure. Simple. Trusted.</div>
		</div>
		<nav class="top-nav">
			<a href="#">Help</a>
			<a href="#">Locations</a>
			<a href="#">Support</a>
		</nav>
	</header>

	<div class="content">
		<aside class="side-nav">
			<ul>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Contact</a></li>
				<li><a href="#">Open an Account</a></li>
				<li><a href="#">Rates & Fees</a></li>
				<li><a href="#">Security</a></li>
			</ul>
		</aside>

		<main class="main">
			<section class="welcome">
				<h1>Welcome to ACME Bank</h1>
				<p>Your financial partner for secure online banking.</p>
			</section>

			<section class="login-card" aria-labelledby="loginHeading">
				<h2 id="loginHeading">Online Banking Login</h2>
				<form action="<%=request.getContextPath()%>/home" method="post" class="login-form">
					<div class="form-group">
						<label for="username">Username</label>
						<input id="username" name="username" type="text" placeholder="Enter your username" required>
					</div>

					<div class="form-group">
						<label for="password">Password</label>
						<input id="password" name="password" type="password" placeholder="Enter your password" required>
					</div>

					<div class="form-actions">
						<button type="submit" class="btn primary">Sign In</button>
						<a class="link" href="#">Forgot password?</a>
					</div>
				</form>

				<div class="signup">
					<p>New to ACME Bank? <a href="#">Open an account</a></p>
				</div>
			</section>
		</main>
	</div>

	<footer class="site-footer">
		<div>© <script>document.write(new Date().getFullYear());</script> ACME Bank. All rights reserved.</div>
		<div class="small-links">
			<a href="#">Privacy</a> · <a href="#">Terms</a> · <a href="#">Contact</a>
		</div>
	</footer>
</div>

</body>
</html>