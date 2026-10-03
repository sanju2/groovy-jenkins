def deploy(String environment, String application, String version) {

    echo "Starting deployment..."
    echo "Application : ${application}"
    echo "Version     : ${version}"
    echo "Environment : ${environment}"

    if (environment == "prod") {
        echo "Production deployment detected."
    } else {
        echo "Non-production deployment."
    }

    echo "Deploying ${application}:${version} to ${environment}..."

    sh """
        echo "Running deployment command..."
        echo "kubectl apply -f deployment.yaml"
    """

    echo "Deployment completed successfully!"
}

return this
