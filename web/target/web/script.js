function sendLine() {
		line = document.querySelector('.lineValue').value;
		var params = '?lineValue='+line;
		var url = 'MainServlet' + params;
		var request = new XMLHttpRequest();
		request.onreadystatechange = function() {
			if (request.readyState == 4 && request.status == 200) {
				var response = request.responseText;
				document.querySelector('.response').innerHTML = response;
			}
		}
		request.open('GET', url, true);
		request.setRequestHeader('Content-Type',
				'application/x-www-form-urlencoded');
		request.send('');
}