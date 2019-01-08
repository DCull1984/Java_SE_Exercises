wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -

echo "deb https://pkg.jenkins.io/debian binary/" | sudo tee -a /etc/apt/sources.list

apt install openjdk-8-jre-headless

sudo apt-get update

sudo apt-get install jenkins

